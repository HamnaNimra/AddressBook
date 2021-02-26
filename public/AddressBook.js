var table = document.getElementById("buddies-table");
var submit = document.getElementById("submit");

var addressBookBuddiesLink = null;
createNewAddressBook();

function createNewAddressBook(){
    fetch('http://localhost:8080/addressbook', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({})
    }).then(function (value) {
        value.json().then(function (addressBook) {
            addressBookBuddiesLink = addressBook._links.self.href;
        });
    });
};

function addNewBuddy(e) {
    e.preventDefault();
    var name = document.getElementById("buddyName").value;
    var buddyNumber = document.getElementById("buddyNumber").value;

    fetch('http://localhost:8080/buddy', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            "name": name,
            "phoneNumber": buddyNumber
        })
    }).then(function (value) {
        value.json().then(function (buddy) {
            var buddyAddressBookUrl = buddy._links.addressBook.href;

            fetch(buddyAddressBookUrl, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'text/uri-list'
                },
                body: addressBookBuddiesLink
            }).then(function (value1) {
                attachBuddyToUI(buddy.name, buddy.phoneNumber);
            })
        });
    });
}

function attachBuddyToUI(name, phoneNumber) {
    var buddyRow =  document.createElement('tr')
    buddyRow.innerHTML = "<td>"+name+"</td><td>"+phoneNumber+"</td>";

    table.tBodies[0].insertBefore(buddyRow,table.rows[table.rows.length-1])

}

submit.addEventListener("click", addNewBuddy);