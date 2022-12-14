public class phoneuser {
    
    private phone phone;

    public phoneuser(phone phone){
        this.phone = phone;
    }

    void turnOnThePHone(){
        this.phone.powerOn();
    }

    void turnOffThePHone(){
        this.phone.powerOff();
    }

    void makePhoneLouder(){
        this.phone.volumeUp();
    }

    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}