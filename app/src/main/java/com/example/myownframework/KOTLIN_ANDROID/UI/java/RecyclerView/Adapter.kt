package com.example.myownframework.Kotlin_Android.UI.java.RecyclerView

/*

In Android, a ViewHolder is a static inner class that stores references to the views
for one entry in a RecyclerView. It is a design pattern that improves the performance of a RecyclerView

A ViewHolder is a wrapper around a View that contains the layout for an individual item in the list.
A ViewHolder describes an item view and metadata about its place within the RecyclerView.
A ViewHolder uses FindViewById to get references to the views inside the inflated item-layout file.
A ViewHolder helps reduce the number of calls to find view by id.
A ViewHolder design pattern is used to speed up rendering of your ListView.
A ViewHolder uses references to avoid time consuming findViewById() method to update the widgets with new data








    public class Adapter extends RecyclerView.Adapter<LoadAdapter.ViewHolder> {
        private ArrayList<LoadResponce> listdata;

        Context context;

        public LoadAdapter(ArrayList<LoadResponce> listdata, Context context) {
            this.listdata = listdata;
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View listItem= layoutInflater.inflate(R.layout.load_item, parent, false);
            ViewHolder viewHolder = new ViewHolder(listItem);
            return viewHolder;
        }

        public void itemUpdated(int postion) {

            try {
                if (listdata.get(postion).isIsdatachanged()) {

                    String scanedItem = listdata.get(postion).getScanarts();
                    int scanedItemNum = Integer.parseInt(scanedItem);
                    int scanItemPlus = scanedItemNum + 1;
                    String scanItemtoString = String.valueOf(scanItemPlus);

                    LoadResponce loadData = listdata.get(postion);
                    loadData.setPcode(loadData.getPcode());
                    loadData.setStatus(loadData.getStatus());
                    loadData.setStnname(loadData.getStnname());
                    loadData.setScanarts(scanItemtoString);
                    loadData.setLotno(loadData.getLotno());
                    loadData.setWbillno(loadData.getWbillno());
                    listdata.remove(postion);
                    listdata.add(0, loadData);
                    notifyDataSetChanged();
                }
                listdata.get(postion).setIsdatachanged(false);

            }catch (Exception e){
                e.printStackTrace();
            }

        }

        @Override
        public void onBindViewHolder(ViewHolder holder,  int position) {

            try {

                final LoadResponce myListData = listdata.get(position);

                holder.pcode.setText(myListData.getPcode());
                holder.wbillno.setText(myListData.getWbillno());
                holder.date.setText(myListData.getBkdate());
                holder.lotno.setText(myListData.getLotno());
                holder.scanarts.setText(myListData.getScanarts());
                holder.stnname.setText(myListData.getStnname());

                if(Integer.parseInt(myListData.getScanarts()) < Integer.parseInt(myListData.getLotno())) {
                    holder.wbillno.setTextColor(Color.parseColor("#2398bc"));
                    holder.wbillno.setEnabled(true);
                }else {
                    holder.wbillno.setTextColor(Color.parseColor("#FF000000"));
                    holder.wbillno.setEnabled(false);
                }


                holder.wbillno.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        LoadResponce loadData = listdata.get(position);
                        //itemOnClick.onItemClick(myListData.getPayCode(),myListData.getWayBillNo(),myListData.getBkdt(), Utils.UnLoadCode);
                        goToUnScannedItemDetails(loadData.getPcode(),loadData.getWbillno(),loadData.getBkdate());
                    }
                });

            }catch (Exception e){
                e.printStackTrace();
            }




        }


        @Override
        public int getItemCount() {
            return listdata.size();
        }

        private void goToUnScannedItemDetails(String paycode, String waybill, String date) {
            Intent intent = new Intent(context, UnScannedItemsDetils.class);
            intent.putExtra(EXTRA_PAYCODE,paycode);
            intent.putExtra(EXTRA_WAYBILL,waybill);
            intent.putExtra(EXTRA_DATA,date);
            intent.putExtra(EXTRA_L_U,Utils.LoadCode);
            context.startActivity(intent);
        }


        public static class ViewHolder extends RecyclerView.ViewHolder {


            public TextView status;
            public  TextView  pcode;
            public TextView wbillno;

            public TextView date;
            public TextView  lotno ;
            public TextView scanarts;

            public TextView stnname;


            public ViewHolder(View itemView) {
                super(itemView);

                status = (TextView) itemView.findViewById(R.id.status);
                pcode = (TextView) itemView.findViewById(R.id.pcode); // T
                wbillno = (TextView) itemView.findViewById(R.id.wbillno); // R025110
                date = (TextView) itemView.findViewById(R.id.date);

                lotno  = (TextView) itemView.findViewById(R.id.lotno);
                scanarts = (TextView) itemView.findViewById(R.id.scanarts);
                stnname = (TextView) itemView.findViewById(R.id.stnname);


            }
        }
    }
*/

