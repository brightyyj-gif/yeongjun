import React from 'react'
import Example1 from './Example'
import Example2 from './Example2'
import Example3 from './Example3'
import Example4 from './Example4'
import { useState } from 'react'


function App() {
  const [tab,setTab] = useState(1);
  return (
    <div className='app'>
      <h1>useMemo & useCallBack</h1>
      <p style={{ marginBottom: 20, color: '#666' }}>콘솔(F12)에서 로그를 확인하세요.</p>
      <div style={{marginBottom: 20, flexWrap: 'wrap', display: 'flex', gap: 8}}>
        <button className="btn btn-primary" onClick={() => setTab(1)}>useMemo 1</button>
        <button className="btn btn-primary" onClick={() => setTab(2)}>useMemo </button>
        <button className="btn btn-primary" onClick={() => setTab(3)}>useCallBack 1</button>
        <button className="btn btn-primary" onClick={() => setTab(4)}>useCallBack 2</button>
      </div>
      {tab === 1 && <Example1/>}
      {tab === 2 && <Example2/>}
      {tab === 3 && <Example3/>}
      {tab === 4 && <Example4/>}

      {/* <Example1/> */}
      {/* <Example2/> */}
      {/* <Example3/> */}
      {/* <Example4/> */}
    </div>
  )
}

export default App

