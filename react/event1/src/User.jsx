
function User({user, onRemove}) {
  return (
    <div>
      <b>{user.username}</b> <span>({user.email})</span>
      <button onClick={()=>onRemove(user.id)}>삭제</button>
      {/* onRemove 함수의 파라미터로 호출 */}
    </div>
  )
}

export default User
