
new Vue({
    el: '#app',
    data: {
        period: '',
        typeOfSport: '',
        showAllAdventures: false,
        advs: [
            "aadsf",
            "sadf"
        ]

    },
    methods: {
        search: function () {
            return this.typeOfSpotrs.push({name: this.typeOfSprt})

        },

        // pare ca functioneaza, dar n are css si html
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

        search: function () {


        }
    },
    mounted: function(){
        this.getAllAdventures();
    }

})