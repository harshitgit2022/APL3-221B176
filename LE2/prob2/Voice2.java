public class Voice2 {
    public void prepareVoice() {
        System.out.println("Preparing voice...");
        
    }

    public void hear() {
        System.out.println("Hearing voice...");
        
    }

    public void templateMethod() {
        
        prepareVoice();
        hear();
    }

    public static void main(String[] args) {
        Voice2 voiceInstance = new Voice2();
        voiceInstance.templateMethod();
    }
}
