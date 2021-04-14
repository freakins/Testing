import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // tesssttt
        // xd
        // ddwdawd
        /// dwadadw
        int domme =0;
        int tom =0;
        boolean countTom = false;
        String tomS = "Tom:";
        String dommeS = "Dominik Plaßmann:";

        String meinString;
        try {
            BufferedReader in = new BufferedReader (
                    new FileReader ("C:\\Users\\vogt_\\Downloads\\dommechat.txt") );
            try {
                while( (meinString = in.readLine()) != null ) {
                    System.out.println(meinString);
                    if (meinString.contains(tomS)){
                        countTom = true;
                        tom -= tomS.length();
                    }else if (meinString.contains(dommeS)){
                        countTom = false;
                        domme -= dommeS.length();
                    }

                    if (countTom){
                        tom += meinString.length();

                    }else if (!countTom){
                        domme += meinString.length();

                    }
                }
                in.close();
            } catch (IOException e) {
                System.out.println("Read error " + e);
            }
        }
        catch (IOException e) {
            System.out.println("Open error " + e);
        }

        System.out.println("Domme" + domme);
        System.out.println("Tom:" + tom);

    }
}
