public class Calculator {
    public static void main(String[] args){
        System.out.println("Введите выражение: ");
        ReadNum rd = new ReadNum();
        String rdin = rd.readNextString();
        String[] mass;
        String arbitr1;
        String arbitr2;
        String calc;
        try {
            mass = SplitNum.valArray(rdin);
            arbitr1 = ArbitrNum.valArbitr(mass[0]);
            arbitr2 = ArbitrNum.valArbitr(mass[1]);
            calc = Calc.calc(mass[0],mass[1], mass[2], arbitr1, arbitr2);
            System.out.println("Результат: "+calc);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
