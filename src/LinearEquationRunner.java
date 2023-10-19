public class LinearEquationRunner {
    public void main(String[]args) {
        LinearEquation po = new LinearEquation(50,0,40,10);
      /*  System.out.printf("%.2f %n", po.distance());
        System.out.printf("%.2f %n", po.slope());
        System.out.printf("%.2f %n", po.yint());
        System.out.println(po.equationToString()); */
        System.out.println(LinearEquation.equationInfo());
    }
}
