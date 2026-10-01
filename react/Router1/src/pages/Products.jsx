import {Link} from "react-router-dom"

const products = [
  {
    id: 1,
    name: "노트북",
    price: 1200000,
  },
  {
    id: 2,
    name: "마우스",
    price: 30000,
  },
  {
    id: 3,
    name: "키보드",
    price: 80000,
  },
];
function Products() {

  return (
    <div>
      <h1>상품목록</h1>
      {products.map((product) => (
         <div key={product.id}>
          <h3>
            {product.name}
          </h3>

          <p>
            {product.price.toLocaleString()}원
          </p>    

           <Link to={`/products/${product.id}`}>
            상세보기
           </Link>  

         </div>   
      ))};


    </div>
  )
}

export default Products