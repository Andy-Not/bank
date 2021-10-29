import {useState} from "react";

const BackendTest = () => {
    const [userName, setUserName] = useState("");

    const fetchUser = async () => {
      const response = await fetch("http://localhost:8080/address/addAddress",{
          method: 'POST',
          body: {
              "city": "poopTown1",
              "street": "spongebob road1",
              "state": "obama2",
              "zipCode": "77182"
          },
          headers: {
              'Content-Type': 'application/json'
          }
      });
        if (!response.ok){
            throw new Error('something went wrong');
        }
        console.log('REQUESTED SEARCH')
        const data = await response.json()
        console.log(data);


    }

    const onSubmit = (event) => {
        event.preventDefault();
        fetchUser();
    }

  return(
      <div>
          <form action="" onSubmit={onSubmit}>
              <label htmlFor="">Get User info</label>
              <input type="text"/>
              <button type={"submit"}>Search</button>
          </form>
          <div>
              <div>
                  <h1>first name</h1>Andy
              </div><br/>
              <div>
                  <h1>last name</h1>Andy
              </div><br/>
              <div>
                  <h1>email</h1>Andy
              </div><br/>
              <div>
                  <h1>password</h1>Andy
              </div><br/>
              <div>
                  <h1>phonenumber</h1>Andy
              </div><br/>
              <div>
                  <h1>social security</h1>Andy
              </div>
          </div>
      </div>
  )
}

export default BackendTest;