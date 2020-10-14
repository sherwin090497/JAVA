public interface Feature {
    String use();
}

class FlipFeature implements Feature {
    @Override
    public String use() {
        return "Flip!";
    }
}

class TouchscreenFeature implements Feature {
    @Override
    public String use() {
        return "Touch the screen?";
    }
}

class QwertyFeature implements Feature {
    @Override
    public String use() {
        return "Here's a QWERTY keyboard.";
    }
}