let id = 0;
export function createUser(firstname, lastname, birthdate, email, phone, avatar) {
    return {
        id: ++id,
        firstname: firstname,
        lastname: lastname,
        birthdate: birthdate,
        email: email,
        phone: phone,
        avatar: avatar
    };
}
