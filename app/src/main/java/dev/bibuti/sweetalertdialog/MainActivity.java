package dev.bibuti.sweetalertdialog;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.bibuti.sweetalertdialoglibrary.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE);
        pDialog.setTitleText("Loading");
        pDialog.setCancelable(false);
        pDialog.setConfirmText("Sure");
        pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                sweetAlertDialog.setTitleText("Deleted!")
                        .setContentText("Your imaginary file has been deleted!")
                        .setConfirmText("OK")
                        .setConfirmClickListener(null)
                        .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
            }
        });
        pDialog.show();

    }
}
