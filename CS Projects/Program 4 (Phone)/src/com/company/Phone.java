public class Phone<T extends Feature>{

    PhoneState state;
    T feature;
    public T getFeature() {
        return feature;
    }

    public Phone(T feature, PhoneState state) {
        super();
        this.feature = feature;
        this.state = state;
    }

    public boolean willVibrate() {
        return state.willVibrate();
    }

    public boolean willRing() {
        return state.willRing();
    }

    public PhoneState nextState() {
        return state.nextState();
    }

    public PhoneState nextState() {
        return state.nextState();
    }

    public PhoneState getCurrentState() {
        return state;
    }


}