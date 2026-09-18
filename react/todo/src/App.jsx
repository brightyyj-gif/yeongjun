import Header from './component/Header'
import { useState, useRef } from 'react';
import TodoList from './component/TodoList';
const mockTodo =[
  {
    id:0,
    isDone : false,
    content:"react 공부하기",
    createdDate : new Date().getTime(),
  },
   {
    id: 1,
    isDone: false,
    content: "빨래 널기",
    createdDate: new Date().getTime(),
  },
  {
    id: 2,
    isDone: false,
    content: "노래 연습하기",
    createdDate: new Date().getTime(),
  },
];
function App() {
   const[todo,setTodo] = useState(mockTodo);
    const idRef = useRef(3);

    const onCreate = (content) =>{
      const newItem = {
        id:idRef.current,
        content,
        isDone : false,
        createdDate: new Date().getTime(),
      }
      setTodo([newItem,...todo]);
      idRef.current += 1;
    }

    const onUpdate = (targetId) =>{
      setTodo(todo.map((it) =>{
        return it.id === targetId ? {...it, isDone :!it.isDone} :it
      }))
    };

    const onDelete = (targetId) =>{
      setTodo(todo.filter((it) => it.id !== targetId));
    }
  return (
    <div>
      <Header/>
      <TodoList todo={todo} onCreate={onCreate} onUpdate={onUpdate} onDelete={onDelete}/>
      
    </div>
  )
}

export default App