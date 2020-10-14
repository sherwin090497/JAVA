 interface PhoneState {

    boolean willVibrate();
    boolean willRing();
    PhoneState nextState();
}

 class Ring implements PhoneState{

    public boolean willVibrate() {
        return true;
    }

    public boolean willRing() {
        return true;
    }

     public PhoneState nextState() {
         Vibrate vibrate = new Vibrate();
         return vibrate;
     }
}


 class Vibrate implements PhoneState{

    public boolean willVibrate() {
        return true;
    }

    public boolean willRing() {
        return false;
    }

     public PhoneState nextState() {
         Silent silent = new Silent();
         return silent;
     }
}

 class Silent implements PhoneState{

    public boolean willVibrate() {
        return false;
    }

    public boolean willRing() {
        return false;
    }

    public PhoneState nextState() {
        Ring ring = new Ring();
        return ring;
    }
}