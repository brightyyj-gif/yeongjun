import React from 'react';

function User({user, onRemove, onToggle}) {
  return (
    <div>
      <b 
       style={{
         cursor: 'pointer',
         color: user.active ? 'green' : 'black'
       }}
       onClick={()=>onToggle(user.id)}
      >{user.username}</b> <span>({user.email})</span>
      <button onClick={()=>onRemove(user.id)}>삭제</button>
      {/* onRemove 함수의 파라미터로 호출 */}
    </div>
  )
}

export default React.memo(User);