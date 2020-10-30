package com.example.day04_bai2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterGiaoDich extends BaseAdapter {
    List<GiaoDich> list;

    public AdapterGiaoDich(List<GiaoDich> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View v=layoutInflater.inflate(R.layout.item_giao_dich, viewGroup, false);

        TextView tvNgay=v.findViewById(R.id.tvNgay);
        TextView tvMa=v.findViewById(R.id.tvMa);
        TextView tvGTMua=v.findViewById(R.id.tvGTMua);
        TextView tvGTBan=v.findViewById(R.id.tvGTBan);
        TextView tvLoiNhuan=v.findViewById(R.id.tvLoiNhuan);

        GiaoDich gd=list.get(i);

        tvNgay.setText(gd.getNgay());
        tvMa.setText(gd.getMa());
        tvGTMua.setText(gd.getGtMua()+"");
        tvGTBan.setText(gd.getGtBan()+"");
        tvLoiNhuan.setText(gd.getLoiNhuan()+"");

        return v;
    }
}
