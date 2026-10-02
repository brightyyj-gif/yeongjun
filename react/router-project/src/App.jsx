import {Routes, Route} from 'react-router-dom'
import Layout from './components/layout'
import About from './pages/About'
import Home from './pages/Home'
import Contact from './pages/contact'
import NotFound from './pages/NotFound'

function App() {
  return (
    <Routes>
      <Route path='/' element={<Layout/>}>
        <Route index element={<Home/>} />
        <Route path='about' element={<About/>} />
        <Route path='Contact' element={<Contact/>} />
        <Route path='*' element={<NotFound/>} />
      </Route>
    </Routes>
  )
}

export default App
