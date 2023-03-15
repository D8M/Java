public class MegabytesConverter {
//Class with method printmegaBytesAndKilobytes
    public static void printMegaBytesAndKilobytes(int kiloBytes){
    if (kiloBytes < 0){
        System.out.print("Invalid entry");}
    else{
        int inMegaBytes = kiloBytes/1024;
        int KiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + inMegaBytes + " MB and " + KiloBytes + " KB");
        }




    }

}
