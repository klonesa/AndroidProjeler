package com.ma.MiniProje_OtoPark_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Calendar;
import java.util.List;

public class AdapterSinifi extends RecyclerView.Adapter<AdapterSinifi.CardNesneleri> {

    private Context mContext;
    private List<VeriTabaniBasliklari> list;
    private VeriTabaniOlustur vto=new VeriTabaniOlustur(mContext);



    public AdapterSinifi(Context mContext, List<VeriTabaniBasliklari> list) {
        this.mContext = mContext;
        this.list = list;

    }

    @NonNull
    @Override
    public CardNesneleri onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);
        return new CardNesneleri(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardNesneleri holder, final int position) {

        final int id = list.get(position).getId();
        holder.textView1.setText(String.valueOf(id));
        final String plaka = list.get(position).getPlaka();
        holder.textView2.setText(plaka);
        final String girisSaati = list.get(position).getGirisSaati();
        holder.textView3.setText(girisSaati);


        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                int cikisSaati = c.get(Calendar.HOUR_OF_DAY);
                int cikisDakikasi = c.get(Calendar.MINUTE);





                Intent intent = new Intent(mContext,CikisEkrani.class);
                intent.putExtra("id",id);
                intent.putExtra("plaka",plaka);
                intent.putExtra("cikisSaati",cikisSaati);
                intent.putExtra("cikisDakikasi",cikisDakikasi);
                intent.putExtra("girisSaati",girisSaati);
                mContext.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class CardNesneleri extends RecyclerView.ViewHolder{

        public TextView textView1,textView2,textView3,textView4,textView5;
        public CardView card;

        public CardNesneleri(View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.card);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);

        }
    }
}
