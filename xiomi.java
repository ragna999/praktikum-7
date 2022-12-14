public class xiomi implements phone{
    
    private int volume;
    private boolean isPowerOn;

    public xiomi(){
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android version 16");
    }

    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupkan Hpnya!");
        }
    }
    
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        }else {
            System.out.println("Silahkan Hidupkan handphonenya");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}