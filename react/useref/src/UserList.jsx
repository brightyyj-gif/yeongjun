import User from "./User";

function UserList({users}) {
    
  return (
    <div>
        {/* <User user={users[0]}/>
        <User user={users[1]}/>
        <User user={users[2]}/> */}

        {users.map(user => (
            <User user = {user} key={user.id} />
        ))}
    </div>
  )
}

export default UserList
