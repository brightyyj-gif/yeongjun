import {BrowserRouter,Link,Routes,Route} from 'react-router-dom'
import Home from './pages/Home'
import About from './pages/About'
import Products from './pages/Products'
import Contact from './pages/Contact'
import ProductDetail from './pages/ProductDetail'

function App() {
  return (
    <BrowserRouter>
      <nav style={{display:'flex', gap:'15px', marginBottom:'20px', justifyContent:'center'}}>
        <Link to="/">홈</Link>
        <Link to="/about">소개</Link>
        <Link to="/products">상품</Link>
        <Link to="/contact">연락처</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/about" element={<About/>} />
        <Route path="/products"element={<Products />}/>
        <Route path="/products/:id"element={<ProductDetail />}/>

        <Route path="/contact" element={<Contact />} />

      </Routes>

    </BrowserRouter>
    // 환경을 만들어줌

  )
}

export default App
