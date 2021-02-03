package com.codingwithme.multiviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codingwithme.multiviewrecyclerview.adapter.NewsFeedAdapter
import com.codingwithme.multiviewrecyclerview.model.NewsFeedModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsFeedArray = ArrayList<NewsFeedModel>()
        newsFeedArray.add(NewsFeedModel("https://www.rms.nsw.gov.au/geared/images/does-size-matter-safety-and-the-small-car_654x439.jpg","ჯონიკო","2 mins",2,"ჰაააიიით","https://d3avoj45mekucs.cloudfront.net/rojakdaily/media/jessica-chua/entertainment/2018/oct/he110%20channel%20introduction/hello_main.jpg?ext=.jpg",""))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","ლაურა","12 mins",2,"სილამაზე","https://images.unsplash.com/photo-1508921912186-1d1a45ebb3c1?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGhvdG98ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80",""))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","კოტიკო","25 mins",2,"ვოავუ","https://images8.alphacoders.com/101/thumb-1920-1015027.jpg",""))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","ჰაკერი გივიე","3 mins",3,"ნააჰ","","Video by Elijah O'Donnell from Pexels"))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","შეჩემა","31 mins",2,"რა ჭრელიაა","https://images5.alphacoders.com/105/thumb-1920-1050139.jpg",""))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","გოდერძა","44 mins",3,"დდდდდ","","https://r1---sn-npoeenez.googlevideo.com/videoplayback?expire=1612388125&ei=vcIaYMKkE_TA8gPi1aWQBQ&ip=110.138.193.48&id=o-AHNw7VfjiD-rg9aKOXUZU6nkZ3iMb5KsV2pF6dN7bx-Z&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=BkqKf61HxBqoUjq_BvrH9nAF&gir=yes&clen=806584&ratebypass=yes&dur=10.588&lmt=1583185679669552&fvip=1&c=WEB&txp=6216222&n=DhGSKujDWUuTDJU1y&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgRMYQGBVL9s83RRGS1wp-X6xARgxPKP47LI2E1oe25ZsCIQCtuV_tAGGvQjFU36dx0cFCH_WJ0ceKbeognoFnL5cdyw%3D%3D&redirect_counter=1&rm=sn-2uuxa3vh-n0cr7e&req_id=41f395538819a3ee&cms_redirect=yes&ipbypass=yes&mh=hF&mm=29&mn=sn-npoeenez&ms=rdu&mt=1612366381&mv=m&mvi=1&pl=22&lsparams=ipbypass%2Cmh%2Cmm%2Cmn%2Cms%2Cmv%2Cmvi%2Cpl&lsig=AG3C_xAwRQIhAJC6rCGZbSvuwJkxV0ejd8VOQnD_8z0mrvFn4Fle-izkAiAyra9ao-VgDlttZlXUlrh0bSjovCOhU2k7vlBR0ISVHQ%3D%3D&fbclid=IwAR3vTbK3_R1H3l61J0d3uddnbtH13eUt5VVwq3d1bH6HBKtd5ZG4Z3D5sr0"))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","ფარფატა","17 mins",3,":)","","https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"))
        newsFeedArray.add(NewsFeedModel("https://lh3.googleusercontent.com/a-/AOh14Gh5NOYDiFV9BdkDn1j_FN_AbWKQWtgnMqhJLvaC=s88-c-k-c0x00ffffff-no-rj-mo","ჩალიჩა","28 mins",2,"comedy","https://images.alphacoders.com/101/thumb-1920-1012834.png",""))


        val adapter = NewsFeedAdapter(this,newsFeedArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}