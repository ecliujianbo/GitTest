package com.liu.gittest;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.liu.gittest.bean.User;
import com.liu.gittest.widget.EmptyLayout;

/**
 * Created by Administrator on 2016-1-8.
 */
public class CompanyActivity extends ListActivity {
    private EmptyLayout mEmptyView;
    private ArrayAdapter<String> mAdapter;

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(CompanyActivity.this, "show Toast", Toast.LENGTH_SHORT).show();
        }
    };
    // the list items
    static final String[] MOVIES = new String[]{
            "Forrest Gump",
            "Toy Story",
            "Saving Private Ryan",
            "Toy Story 2",
            "The Green Mile",
            "Cast Away",
            "Road to Perdition",
            "Catch Me If You Can",
            "The Terminal",
            "The Polar Express",
            "The Da Vinci Code",
            "Angels & Demons",
            "Toy Story 3",
            "Extremely Loud & Incredibly Close",
            "Cloud Atlas",
            "Captain Phillips",
            "Toy Story 4",
            "The Lost Symbol"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);
        mEmptyView = new EmptyLayout(this, getListView());
        mEmptyView.setErrorButtonClickListener(mClickListener);
        initList();



    }

    // Triggered when "Empty" button is clicked
    public void onShowEmpty(View view) {
        // clear the list and show the empty layout
        mAdapter.clear();
        mEmptyView.showEmpty();
    }

    // Triggered when "Loading" button is clicked
    public void onShowLoading(View view) {
        // clear the list and show the loading layout
        mAdapter.clear();
        mEmptyView.showLoading();
    }

    // Triggered when "Error" button is clicked
    public void onShowError(View view) {
        // clear the list and show the error layout
        mAdapter.clear();
        mEmptyView.showError();
    }

    // Triggered when "List" button is clicked
    public void onShowList(View view) {
        // show the list
        initList();
    }

    private void initList() {
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, MOVIES);
        setListAdapter(mAdapter);
    }
}
