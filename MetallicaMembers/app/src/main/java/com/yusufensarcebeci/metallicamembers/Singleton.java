package com.yusufensarcebeci.metallicamembers;

public class Singleton {
    private Members selectedMembers;
    private static Singleton singleton;

    private Singleton () {
    }

    public Members getSelectedMembers() {
        return selectedMembers;
    }

    public void setSelectedMembers(Members selectedMembers) {
        this.selectedMembers = selectedMembers;
    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
