import java.util.Scanner;

class ThreeProjectTest {//name class use  upper case style
    private static final String MESSAGE = "Мы проводим комплексную терапию дакриоаденита, которая включает лечение основного заболевания и симптомов воспаления слезной железы. Пациентам назначаются антибактериальные препараты (антибиотики, сульфаниламиды), противовоспалительные, антимикробные средства в виде глазных капель, мазей, для приема внутрь; УВЧ-терапия, электролечение. При необходимости мы проводим вскрытие очага гнойного воспаления слезной железы.";


    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        String inputString = sanner.nextLine();
        if (inputString.length() != 1) {
            throw new RuntimeException("Can not read word because value is broken " + inputString);
        }
        int y = MESSAGE.indexOf(inputString.charAt(0));
        System.out.println("Start number message char " + y);


    }
}



