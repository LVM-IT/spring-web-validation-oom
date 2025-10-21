package lvm.example.demo;

import jakarta.validation.constraints.Size;

public class EmailAttachement {
    private String name;

    @Size(max=5_000_000)
    private byte[] attachement;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getAttachement() {
        return attachement;
    }

    public void setAttachement(byte[] attachement) {
        this.attachement = attachement;
    }
}
