import React from 'react'
import Toolbar from './components/Toolbar'
import ContentPanel from './components/ContentPanel'
import { useApp,AppProvider } from './context/AppContext'

function AppShell(){
  const {theme} = useApp();
   <div className={`app ${theme}`}>
      <header>
         <h1>Props 예제</h1>
         <span className="badge">상태는 App · props로 전달</span>
      </header>
      <Toolbar />
      <ContentPanel/>
    </div>
}
export default function App() {
  return (
    <AppProvider>
      <AppShell/>
    </AppProvider>
  )
}

