package bsint.project.autobiography;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.project.library001.FoldingCell;
import com.project.library002.SweetAlertDialog;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get our folding cell
        FoldingCell fc1 = findViewById(R.id.folding_cell1);
        FoldingCell fc2 = findViewById(R.id.folding_cell2);
        FoldingCell fc3 = findViewById(R.id.folding_cell3);
        FoldingCell fc4 = findViewById(R.id.folding_cell4);
        FoldingCell fc5 = findViewById(R.id.folding_cell5);

        // attach click listener to folding cell
        fc1.setOnClickListener(v -> fc1.toggle(false));
        fc2.setOnClickListener(v -> fc2.toggle(false));
        fc3.setOnClickListener(v -> fc3.toggle(false));
        fc4.setOnClickListener(v -> fc4.toggle(false));
        fc5.setOnClickListener(v -> fc5.toggle(false));

        welcome();
    }

    public void welcome()
    {
        SweetAlertDialog a = new SweetAlertDialog(this);
        a.setTitleText("ITS 202 - Section C");
        a.setConfirmClickListener(sDialog -> sDialog
                .setTitleText("GROUP 2 - MEMBERS")
                .setContentText("✔ CARVAJAL, CHRISTIAN FRANC\n" +
                        "✔ CAÑONEO, JERSON\n" +
                        "✔ CENIZA, CARL VINCENT\n" +
                        "✔ CRISOSTOMO, CARMELA JANE\n" +
                        "✔ CUAL, JOEMAR")
                .setConfirmText("OK")
                .setConfirmClickListener(null));
        a.show();
    }

    @Override
    public void onBackPressed()
    {
        SweetAlertDialog aa = new SweetAlertDialog(this);
        aa.setTitleText("Thanks for using our app.");
        aa.setContentText("This app is custom made\n\t\tlibs we were using.");
        aa.setCancelText("Cancel");
        aa.setConfirmText("Exit");
        aa.showCancelButton(true);
        aa.setCancelClickListener(SweetAlertDialog::cancel).show();
        aa.setConfirmClickListener(sweetAlertDialog -> finish()).show();
    }
}