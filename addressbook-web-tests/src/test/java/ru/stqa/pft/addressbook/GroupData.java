package ru.stqa.pft.addressbook;

public class GroupData {
    private final String namegroup;
    private final String header;
    private final String footer;

    public GroupData(String namegroup, String header, String footer) {
        this.namegroup = namegroup;
        this.header = header;
        this.footer = footer;
    }

    public String getNamegroup() {
        return namegroup;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
