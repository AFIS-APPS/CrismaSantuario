package com.apps.afis.crismasantuario.Firebase.Querys;

import android.support.annotation.NonNull;
import android.util.Log;

import com.apps.afis.crismasantuario.Firebase.CloudFirestore.FBFirestore;
import com.apps.afis.crismasantuario.Models.Turmas;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Map;

import javax.annotation.Nullable;

public class QrTurmas {

    public static void createTurma(Turmas turmas){
        CollectionReference db = FBFirestore.getDBRef().collection("Turmas");

        db.add(turmas).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {

            }
        });

    }

    public static void updateTurma(Map<String,Object> paramUpdate){
        CollectionReference db = FBFirestore.getDBRef().collection("Turmas");

        db.document().update(paramUpdate);
    }

    public static void deleteTurma(){
        CollectionReference db = FBFirestore.getDBRef().collection("Turmas");
        db.document().delete();

    }

    public static void selectTurma(){

                CollectionReference db = FBFirestore.getDBRef().collection("Turmas");

                db.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        for (QueryDocumentSnapshot documentSnapshot : task.getResult()) {
                            Turmas turmas = new Turmas();
                            turmas = documentSnapshot.toObject(Turmas.class);
                            Log.d("teste", turmas.getNomeTurma());
                            Log.d("teste", turmas.getIdTurma());
                            Log.d("teste", turmas.getCatequistasTurma().get(0) + " " + turmas.getCatequistasTurma().get(1));
                        }
                    }
                });
    }

    private static void snapshotTurma(){
        CollectionReference db = FBFirestore.getDBRef().collection("Turmas");

        db.document().addSnapshotListener(new com.google.firebase.firestore.EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if(documentSnapshot != null && documentSnapshot.exists()){
                    Turmas turmas = new Turmas();
                    turmas= documentSnapshot.toObject(Turmas.class);
                }
            }
        });

    }

}
