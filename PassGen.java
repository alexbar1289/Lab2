import java.util.Random;
public class PassGen {
    public String getPass(int passLength){
        String password = " ";
        for(int i=0; i<passLength; ++i){
            password += (char)randRange('A','Z');
        }
        return password;
    }
    public int randRange (int min, int max){
        int value=0;
        Random random=new Random();
        return min+random.nextInt(max-min+1);
    }
}
