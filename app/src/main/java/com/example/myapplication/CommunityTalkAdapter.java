package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 마루소프트 on 2018-02-01.
 */

//start, result 값비교 갱신


    public class CommunityTalkAdapter extends RecyclerView.Adapter<CommunityTalkAdapter.ViewHolder> {
    Activity context;
        ArrayList<Talk_CallBackItem.Data> items;






        //커뮤니티 토크 어댑터 함수를 만듬으로써 context와 item을 상속해 준다.
        public CommunityTalkAdapter(Activity context, ArrayList<Talk_CallBackItem.Data> items) {
            this.context = context;
            this.items = items;
        }

        //in create view holder는 뷰홀더에 넣어줄 layout을 찾는 애다.
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_talk_list,parent,false);
            return new ViewHolder(view);
        }
        //온바인드뷰홀더는 아이템을 세팅하거나 스크롤링 할때 호출되는 애다. 때문에 position이 필요하다.
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.id.setText(items.get(position).getT_user_id());
            holder.content.setText(items.get(position).getT_content());
            holder.date.setText(items.get(position).getT_write_date());
            holder.title.setText(items.get(position).getT_title());
            holder.like.setText(String.valueOf(items.get(position).getT_like()));
            holder.count.setText(String.valueOf(items.get(position).getT_r_count()));


        }

        @Override
        public int getItemCount() {
            return items.size();
        }

        //뷰홀더라는 애는 아이템안에 들어갈 텍스트등의 내용을 초기화 하는 역할이다.
        class ViewHolder extends RecyclerView.ViewHolder{
            TextView content, id, title, date, no, like, count;
            public ViewHolder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        System.out.println(getPosition());
                        //어댑터에서는 this를 쓸 수 없으므로 context를 쓴다. context는 이 레이아웃의 변수들?
                        Intent intent = new Intent(context , DetailActivity.class);
                        //변수를 해당 activity로 넘긴다.
                        intent.putExtra("title", items.get(getAdapterPosition()).getT_title());
                        intent.putExtra("pwd", items.get(getAdapterPosition()).getT_pwd());
                        intent.putExtra("id", items.get(getAdapterPosition()).getT_user_id());
                        intent.putExtra("date", items.get(getAdapterPosition()).getT_write_date());
                        intent.putExtra("content", items.get(getAdapterPosition()).getT_content());
                        intent.putExtra("no", items.get(getAdapterPosition()).getT_no());
                        intent.putExtra("like", items.get(getAdapterPosition()).getT_like());
                        context.startActivityForResult(intent, 1002);
                    }
                                            });

                title = itemView.findViewById(R.id.tv_text_title);
                content = itemView.findViewById(R.id.tv_text_content);
                id = itemView.findViewById(R.id.tv_text_id);
                date = itemView.findViewById(R.id.tv_text_date);
                like = itemView.findViewById(R.id.tv_text_like);
                count = itemView.findViewById(R.id.tv_text_view);
            }
        }
    }


