package com.summerschool.icecreamshop.model;





    public  class BasketProduct{
        private Long id;
        private Long productid;
        private Double price;
        private Integer quantity;

        public Long getId(){
            return id;
        }
        public void setId(Long id)
        {
            this.id=id;
        }

        public Long getProductid()
        {
            return productid;
        }

        public void setProductid(Long productid)
        {
            this.productid=productid;
        }
        public Double getPrice(){
            return price;
        }
        public void setPrice(Double price){
            this.price=price;
        }
        public Integer getQuantity(){
            return quantity;
        }
        public void setQuantity(Integer quantity){
            this.quantity=quantity;
        }

        public BasketProduct(Long id, Long  productId,  Integer quantity, Double price) {
            this.id = id;
            this.productId = productId;
            this.quantity = quantity;
            this.price = price;
        }



    }





