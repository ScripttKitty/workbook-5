package org.example;

public class Tshirt {

    private Colors color;
    private Sizes size;
    private Fit fit;

    public Tshirt(Colors color, Sizes size, Fit fit) {
        this.color = color;
        this.size = size;
        this.fit = fit;
    }

  public String tshirtBuilder() {
    StringBuilder tshirtBuild = new StringBuilder();
    tshirtBuild.append("Color: ").append(color).append("\n");
    tshirtBuild.append("Size: ").append(size).append("\n");
    tshirtBuild.append("Fit: ").append(fit).append("\n");
    return tshirtBuild.toString();
  }

  public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public Fit getFit() {
        return fit;
    }

    public void setFit(Fit fit) {
        this.fit = fit;
    }
}
