package br.ucs.systemorders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Orders> orders_list;

    public Adapter(List<Orders> orders_list) {
        this.orders_list = orders_list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout,viewGroup,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position)
    {
        viewHolder.setData(orders_list.get(position));
    }
    @Override
    public int getItemCount() {
        return orders_list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtPed;
        private TextView txtMesa;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtPed = itemView.findViewById(R.id.txtPed);
            txtMesa = itemView.findViewById(R.id.txtMesa);
        }
        private void setData(Orders order) {
            txtPed.setText(new
                    Integer(order.getNumOrder()).toString());
            txtMesa.setText(new
                    Integer(order.getTable()).toString());
        }

        @Override
        public void onClick(View view) {

        }
//        public void onClick(View view) {
//            Toast.makeText(view.getContext(),"Você selecionou "
//                    +
//                    filmes.get(getLayoutPosition()).getTitulo(),Toast.LENGTH_LONG).
//                    show();
//        }
    }
}