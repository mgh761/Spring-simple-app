
new Vue({
    el: '#app',
    data: {
        period: '',
        typeOfSport: '',
        adv: '',
        advs: []

    },
    methods: {

        search: function () {
            window.location.href = 'http://localhost:9090/api/vl/bonus/?sport=ATV';
            var thisObj = this;
            axios.get()
                .then(function (response) {
                    console.log("success");
                    thisObj.advs = response.data;
                })


        },

        getAllAdventures: function () {
            var vm = this;
            axios({
                url:'http://localhost:9090/api/vl/adventures/all',
                method: 'get'
            }).then(function (response) {
                vm.adv = response.adv;
                console.log(response);

            })

        },

        addAdventure: function () {
            idType = document.getElementById("idType").value;
            idTime = document.getElementById("idTime").value;
            axios({
                method: 'post',
                url: 'http://localhost:9090/api/v1/adventures/add',
                data: {
                    typeOfSport: idType,
                    time: idTime
                }
            });
        }
    },
    mounted: function(){
        this.getAllAdventures();
    }

})