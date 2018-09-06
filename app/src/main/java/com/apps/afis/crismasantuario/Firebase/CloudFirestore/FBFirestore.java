package com.apps.afis.crismasantuario.Firebase.CloudFirestore;

import com.google.firebase.firestore.FirebaseFirestore;

public class FBFirestore {

    private static FirebaseFirestore firestore;

    public static FirebaseFirestore getDBRef(){

            if(firestore == null){

                firestore = FirebaseFirestore.getInstance();
            }

            return firestore;

    }

}
