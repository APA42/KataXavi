package com.apa42.kata.xavi;

/**
 * Created by APA42 on 07/05/15.
 */
public class SUT {
    private Collaborator1 _collaborator1;

    public SUT(Collaborator1 collaborator1){
        this._collaborator1 = collaborator1;
    }
    public String sayHello() {
        return "hello";
    }

    public String sayWithCollaborator() {
        return "hello " + this._collaborator1.getNombre();
    }
}
