package com.example.admin.envoychallenge.view.mainactivity.adapters;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.envoychallenge.R;
import com.example.admin.envoychallenge.model.GistsResponse;

import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 12/15/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapterTag";

    private List<GistsResponse> mRequestsList;
    Context mContext;

    public RecyclerViewAdapter(List<GistsResponse> mRequestsList) {
        this.mRequestsList = mRequestsList;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        mContext = parent.getContext();
        View mView = LayoutInflater.from(mContext).inflate(R.layout.gist_item, parent, false);

        return new ViewHolder(mView);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        GistsResponse mRequest = mRequestsList.get(position);

        if(!Objects.equals(mRequest.getDescription(), "") || mRequest.getDescription() != null)
            holder.tvRvDescription.setText("Description: " + mRequest.getDescription());

        if(!Objects.equals(mRequest.getCreatedAt(), "") || mRequest.getCreatedAt() != null)
            holder.tvRvCreatedAt.setText("Description: " + mRequest.getCreatedAt());

        if(!Objects.equals(mRequest.getUpdatedAt(), "") || mRequest.getUpdatedAt() != null)
            holder.tvRvUpdatedAt.setText("Description: " + mRequest.getUpdatedAt());

    }

    @Override
    public int getItemCount() {
        return mRequestsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvRvDescription)
        TextView tvRvDescription;
        @BindView(R.id.tvRvCreatedAt)
        TextView tvRvCreatedAt;
        @BindView(R.id.tvRvUpdatedAt)
        TextView tvRvUpdatedAt;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
