package sprite;

import javax.swing.ImageIcon;

public class Alien extends Sprite {
    private Bomb bomb;

    public Alien(int x, int y) {
        this.initAlien(x, y);
    }

    private void initAlien(int x, int y) {
        this.x = x;
        this.y = y;
        this.bomb = new Bomb(x, y);
        String alienImg = "src/images/alien.png";
        ImageIcon img = new ImageIcon(alienImg);
        this.setImage(img.getImage());
    }

    public void act(int direction) {
        this.x += direction;
    }

    public Bomb getBomb() {
        return this.bomb;
    }

    public class Bomb extends Sprite {
        private boolean destroyed;

        public Bomb(int x, int y) {
            this.initBomb(x, y);
        }

        private void initBomb(int x, int y) {
            this.setDestroyed(true);
            this.x = x;
            this.y = y;
            String bombImg = "src/images/bomb.png";
            ImageIcon img = new ImageIcon(bombImg);
            this.setImage(img.getImage());
        }

        public void setDestroyed(boolean destroyed) {
            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {
            return this.destroyed;
        }
    }
}

