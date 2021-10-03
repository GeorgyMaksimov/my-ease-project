import java.util.Scanner;

class ThreeProjectTest {//name class use  upper case style
    private static final String MESSAGE = "Мы проводимм комплексную терапию дакриоаденита, которая включает лечение основного заболевания и симптомов воспаления слезной железы. Пациентам назначаются антибактериальные препараты (антибиотики, сульфаниламиды), противовоспалительные, антимикробные средства в виде глазных капель, мазей, для приема внутрь; УВЧ-терапия, электролечение. При необходимости мы проводим вскрытие очага гнойного воспаления слезной железымин.";


    public static void main(String[] args) {
        Scanner sanner = new Scanner(System.in);
        String inputString = sanner.nextLine();
        if (inputString.length() < 1) {
            throw new RuntimeException("Can not read word because value is broken " + inputString);
        }
        int index = 0;
        int count = 0;
        String lowCaseMessage = MESSAGE.toLowerCase();
        String lowInputString = inputString.toLowerCase();
        do {
            index = lowCaseMessage.indexOf(lowInputString, index);
            if (index >= 0) {
                int spaceEnd = lowCaseMessage.indexOf(" ", index);
                int spaceFirst = lowCaseMessage.lastIndexOf(" ",index);
                int firstWord;
                int lastWord;
                if (spaceFirst >= 0) {
                    firstWord=spaceFirst;
                    //System.out.print(lowCaseMessage.substring(spaceFirst, index));
                } else {
                    firstWord=0;
                    //System.out.print(lowCaseMessage.substring(0, index));
                }
                if (spaceEnd >= 0) {
                    lastWord=spaceEnd;
                    //System.out.println(lowCaseMessage.substring(index, spaceEnd));
                } else {
                    lastWord=lowCaseMessage.length()-1;
                   //System.out.println(lowCaseMessage.substring(index,lowCaseMessage.length()-1));
                }
                System.out.println(lowCaseMessage.substring(firstWord,lastWord));
                count++;
                index += lowInputString.length();
            }
        } while (index >= 0);


        System.out.println("Find words " + count);


    }
}



