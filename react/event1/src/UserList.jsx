import User from "./User";

function UserList({users, onRemove}) {
    
  return (
    <div>
        {/* <User user={users[0]}/>
        <User user={users[1]}/>
        <User user={users[2]}/> */}

        {users.map(user => (
            <User user = {user} key={user.id} onRemove={onRemove} />
            // onRemove함수는 UserList에서도 전달을 받을 것이며
            // User컴포넌트에 전달
        ))}
    </div>
  )
}

export default UserList
