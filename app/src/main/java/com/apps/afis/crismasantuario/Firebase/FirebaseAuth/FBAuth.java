package com.apps.afis.crismasantuario.Firebase.FirebaseAuth;

import com.google.firebase.auth.FirebaseAuth;

public class FBAuth {

    private static FirebaseAuth firebaseAuth;

    public static FirebaseAuth getFirebaseAuth() {

        if (firebaseAuth == null) {

            firebaseAuth = FirebaseAuth.getInstance();

        }

        return firebaseAuth;
    }

}
