import User from './User';
import React from 'react';

function UserList({users, onRemove, onToggle }) {
  
  return (
    <div>
       
        {users.map(user =>(
            <User user={user} key={user.id} onRemove={onRemove} onToggle={onToggle}/>
            // onRemove함수는 UserList 에서도 전달을 받을 것이며
            // User컴포넌트에게 전달
        ))}

    </div>
  )
}

export default React.memo(UserList);
// input을 수정 할 때 하단의 UserList가 리렌더링 되지 않는다.