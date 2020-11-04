import java.math.*;

public class Main {

   public static void main(String[] args) {
//      System.out.println(new DFSF().getDFSF(new BigDecimal(0) , 1).setScale(4, BigDecimal.ROUND_HALF_UP));
//      System.out.println(new DFSF().getDFSF(new BigDecimal(15) , 1).setScale(4, BigDecimal.ROUND_HALF_UP));
//      System.out.println(new DFSF().getDFSF(new BigDecimal(30) , 1).setScale(4, BigDecimal.ROUND_HALF_UP));
//      System.out.println(new DFSF().getDFSF(new BigDecimal(40) , 1).setScale(4, BigDecimal.ROUND_HALF_UP));

//      System.out.println(new DFSF().getDFSF(new BigDecimal(0) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 0.8671d);
//      System.out.println(new DFSF().getDFSF(new BigDecimal(1.428571) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 0.8719d);
//      System.out.println(new DFSF().getDFSF(new BigDecimal(1.8) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 0.8731d);
//      System.out.println(new DFSF().getDFSF(new BigDecimal(2.14) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 0.8742d);
//      System.out.println(new DFSF().getDFSF(new BigDecimal(79.3) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 1);
//      System.out.println(new DFSF().getDFSF(new BigDecimal(17.89) , 2).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue() == 0.9265d);
//      System.out.println(new DFSF(21.960000 , 1));
//      System.out.println(new DFSF(21.960000d , 1) == 0.8184d);

//
//      new Thread(new DFSF(21.960000 , 1)).start();
//      new DFSF(21.960000 , 1);

//      System.out.println(new DFSF(21.960000 , 1).getDFSF() == 0.8184d);
//      System.out.println(new DFSF2(2.14 , 2).getDFSF() == 0.8742d);

      long l = System.currentTimeMillis();

      int count = 50000;

      for (int i = 0; i < count; i++) {
         new DFSF().getDFSF(BigDecimal.valueOf(2.14) , 2);
      }
      System.out.println("DFSF : " +(System.currentTimeMillis() - l) + "ms");

      l = System.currentTimeMillis();
      for (int i = 0; i < count; i++) {
         new DFSF2(2.14 , 2).getDFSF();
      }
      System.out.println("DFSF 2 : " +(System.currentTimeMillis() - l) + "ms");

//      System.out.println(new DFSF2(0, 2).getDFSF() == 0.8671d);
//      System.out.println(new DFSF2(1.428571d, 2).getDFSF() == 0.8719d);
//      System.out.println(new DFSF2(1.800000d, 2).getDFSF() == 0.8731d);
//      System.out.println(new DFSF2(2.140000d, 2).getDFSF() == 0.8742d);
//      System.out.println(new DFSF2(6.666667d, 2).getDFSF() == 0.8893d);
//      System.out.println(new DFSF2(17.890000d, 2).getDFSF() == 0.9265d);

//      System.out.println(BigDecimal.valueOf(0.8123d));
   }
}

/**
 * 1. 표준자원
 *    - 0.4794+(감축시간/40)*(1-0.4794)+0.2 -> 0.4794를 04967로 변경
 * 2. 중소형 자원
 *    - 1-(1-(0.4794+(감축시간/40)*(1-0.4794)+0.2))*0.33 -> 0.4794를 04967로 변경
 * */
class DFSF {
   private static final double MIN_GMC = 0.4967d;

   public BigDecimal getDFSF(BigDecimal amountCurLoadHour , int type){
      BigDecimal dfsf;

      BigDecimal gmc = BigDecimal.valueOf(MIN_GMC);
      double maxTime = 40d;
      BigDecimal cal3 = BigDecimal.ZERO;
      if(amountCurLoadHour.doubleValue() != 0){
         BigDecimal cal1 = amountCurLoadHour.divide(BigDecimal.valueOf(maxTime));
         BigDecimal cal2 = new BigDecimal(1).subtract(gmc);
         cal3 = cal1.multiply(cal2);
      }

      cal3 = cal3.add(gmc);

      dfsf = cal3.multiply(BigDecimal.valueOf(0.8)).add(BigDecimal.valueOf(0.2));
      dfsf = BigDecimal.valueOf(Math.min(1 , dfsf.doubleValue())).setScale(4 , RoundingMode.HALF_UP);

      if(type == 2) {
         dfsf = BigDecimal.ONE.subtract(BigDecimal.ONE.subtract(dfsf).multiply(BigDecimal.valueOf(0.33))).setScale(4, RoundingMode.HALF_UP);
      }
//      System.out.printf("%f " , dfsf.doubleValue());

      return dfsf;
   }
}


class DFSF2{
   private static final double MIN_GMC = 0.4967d;

   private BigDecimal amountCurLoadHour;
   private int type;

   public DFSF2(double v, int i) {
      this.amountCurLoadHour = BigDecimal.valueOf(v);
      this.type = i;
   }

   public double getDFSF(){
      BigDecimal dfsf = BigDecimal.valueOf(0.8).multiply(BigDecimal.valueOf(MIN_GMC).add(
          amountCurLoadHour.divide(BigDecimal.valueOf(40d) , 5, RoundingMode.HALF_UP)
              .multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(MIN_GMC)))))
          .add(BigDecimal.valueOf(0.2)).setScale(4, RoundingMode.HALF_UP);

      if(type == 2){
         dfsf = BigDecimal.ONE.subtract(BigDecimal.ONE.subtract(dfsf).multiply(BigDecimal.valueOf(0.33))).setScale(4, RoundingMode.HALF_UP);
      }
//      System.out.printf("%.4f " , dfsf.doubleValue());
      return dfsf.doubleValue();

   }
}
