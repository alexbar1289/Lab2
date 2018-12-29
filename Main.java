public class Main {
    public static void main (String[] args){
        if(args.length != 2) {
            System.out.println("error in args");
            return;
        }
    int passLength=0;
    int passCount=0;
    for(int i=0; i<args.length; ++i){
        String arg = args[i];
        String[] tokens = arg.split("=");
    if(tokens[0].equals("--passLength")) {
        passLength = Integer.parseInt(tokens[1]);
    }else if(tokens[0].equals("--passCount")){
        passCount = Integer.parseInt(tokens[1]);
    }else{
        System.out.println("error in args");
        return;
    }
    }
    System.out.format("passLength=%d, passCount=%d\n", passLength, passCount);
    PassGen passgen = new PassGen();
    for(int i=0; i<passCount; ++i) {
        String pass= passgen.getPass(passLength);
        System.out.println(pass);
    }
    }
    }

