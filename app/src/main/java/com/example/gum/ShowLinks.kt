package com.example.gum

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gum.databinding.ActivityShowLinksBinding


class ShowLinks : AppCompatActivity() {
    lateinit var binding: ActivityShowLinksBinding
    val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
    val DM_course ="https://www.youtube.com/watch?v=eFDzhn1Inc4&list=PLxIvc-MGOs6gZlMVYOOEtUHJmfUquCjwz"
    val DM_book = "https://www.houstonisd.org/cms/lib2/TX01001591/Centricity/Domain/26781/DiscreteMathematics.pdf"
    val cpp_course ="https://youtube.com/playlist?list=PLC2bk7b6nNlw0x9_QRJjMLrubL035oBMf"
    val cpp_book = "https://vdoc.pub/download/starting-out-with-c-from-control-structures-to-objects-6u0rbiu8eus0"
    val HR_course = "https://www.youtube.com/channel/UCyg3cw24xDDWzyr2idGkjvA/videos"
    val HR_book = "http://www.du.edu.eg/upFilesCenter/spe/1585562834.pdf"
    val eng_course = "https://www.youtube.com/watch?v=AVYfyTvc9KY&list=PL2IkMHFHWdErN1-V9nAeaxXiSkG7kBtjS"
    val math_course = "https://www.youtube.com/watch?v=AVYfyTvc9KY&list=PL2IkMHFHWdErN1-V9nAeaxXiSkG7kBtjS"
    val PH_course = "https://drive.google.com/drive/folders/1RwcTKvxvRQF_BbD9kWDJuM4eNpGXoFb0?usp=sharing"
    val PH_book = "https://drive.google.com/file/d/19Xy9mMODSMM5OrDtM8qcXnkcW2Cz38TW/view?usp=drivesdk"
    val intro_course = "https://www.youtube.com/watch?v=i3SZkTK4-MI&list=PLPetKfNjOEGMUj9AsiZ7uFfCG9v1C0cZI"
    val intro_book = "https://books.google.co.zw/books?id=Oi-dBAAAQBAJ&printsec=frontcover#v=onepage&q&f=false"
    val data_course = "https://youtube.com/playlist?list=PLC2bk7b6nNlw0x9_QRJjMLrubL035oBMf"
    val data_book = "https://vdoc.pub/download/starting-out-with-c-from-control-structures-to-objects-6u0rbiu8eus0"
    val mis_course = "https://youtube.com/playlist?list=PLesgViD0jhW_CiFAf88KgzOCsTqcub7ZN"
    val mis_book = "https://drive.google.com/file/d/1WNAgiCpwIlQKuwEjO-cq2g62J7NXa7Z4/view?usp=drivesdk"
    val inf_course = "https://youtube.com/playlist?list=PL1DUmTEdeA6LXpHtaTyRBok5XnpNzRIfA"
    val inf_book = "https://drive.google.com/file/d/1PCUwsbQENrUbeZyNr_c96wOOtID-idtM/view?usp=drivesdk"
    val logic_course = "https://youtube.com/playlist?list=PLkOpA9uAb9H3e0isTeEqkR-W5PwV8OSTG"
    val logic_book = "https://drive.google.com/file/d/1NyCSVoKc8xu-OL74RMwqxwD-IjV3fXbJ/view?usp=drivesdk"
    val linear_course = "https://youtube.com/playlist?list=PLvuToPs04FnD1lFBolGr4ROQaxQ_zyC1c"
    val linear_book = "https://drive.google.com/file/d/15nrhQESXBr0Z660xDVMCBuBGK8Cb3765/view?usp=drivesdk"
    val statics_course = "https://youtube.com/playlist?list=PLVpJGVBmPnw3eRSzC90oXA6gBcG-nEYIe"
    val statics_book = "https://drive.google.com/file/d/1DgDe148ULnXjmXhqRAFbQL6Jqo1j5Uo4/view?usp=drivesdk"
    val com_cor="https://youtube.com/playlist?list=PL8PzKiHptEaxCPT-usQ2G-8appO0uTvtu"
    val com_bo="https://drive.google.com/file/d/16nAeWXisxAkkrcoPQxIU5cUk7lI5mAEo/view?usp=drivesdk"
    val network_cor="https://youtube.com/playlist?list=PLC2bk7b6nNlxpkwBw5a4nS8Mdg7-CrvMH"
    val network_bo="https://drive.google.com/file/d/1ncuVd2g_wBz23wHjdcdFIoDaE7Ok3ATh/view?usp=drivesdk"
    val algo_cor="https://youtube.com/playlist?list=PLCZPUiJ5kQaHQG9LN3WjxxUmCOKV_heOF"
    val algo_bo="https://drive.google.com/file/d/1-0dk-cpeki131asnyHVOId8gbvhvPKMa/view?usp=drivesdk"
    val sys_cor="https://youtube.com/playlist?list=PL0BIr0VZVPNhyUSutc7mmlt2Z4AwQrzi8"
    val sys_bo="https://drive.google.com/file/d/1pUrpT7EVRtJIBm4PVjkgNao3M1HAx_eL/view?usp=drivesdk"
    val pre_cor=""
    val pre_bo= "https://drive.google.com/file/d/1HrOdvnT4_gV6aRF7uM7wvg9ClCJNoPkU/view?usp=drivesdk"
    val diff_cor="https://youtube.com/playlist?list=PLlHj77inxxPD4ClZOQgzFYJOHZgBfAcQo"
    val dif_bo= "https://drive.google.com/file/d/1MF027S4BT498mBqqK6w61-DEv4R6qbKV/view?usp=drivesdk"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityShowLinksBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var news =  getIntent().getSerializableExtra(EXTRA_MESSAGE) as news
        /*
        val toast = Toast.makeText(applicationContext, news.heading, Toast.LENGTH_LONG)
        toast.show()
         */
        binding.btnCourse.setOnClickListener{
            if(news.heading.equals("C++\n is a popular programming language.\n")){
                openLink(cpp_course)
            }
            else if(news.heading.equals("Discrete mathematics\n Discrete mathematics is the branch of mathematics ")){
                openLink(DM_course)
            }
            else if(news.heading.equals("Human rights \n are rights inherent to all human beings \n")){
                openLink(HR_course)
            }
            else if(news.heading.equals("physics \n is the natural science that studies matter, its ")){
                openLink(PH_course)
            }
            else if(news.heading.equals("English \n the most popular language used in all over the world ")){
                openLink(eng_course)

            }
            else if(news.heading.equals("math \n is used to make equation to solve problems")){
                openLink(math_course)

            }
            else if(news.heading.equals("Computer science \n is the study of computers and computational systems.")){
                openLink(intro_course)
            }
            else if(news.heading.equals("Data structure\n is a storage that is used to store and organize data"))
            {
                openLink(data_course)
            }
            else if(news.heading.equals( "A management information system (MIS)\n is an information system used for decision-making"))
            {
                openLink(mis_course)
            }
            else if(news.heading.equals(  "Information system\n an integrated set of components for collecting, storing, and processing data "))
            {
                openLink(inf_course)
            }
            else if(news.heading.equals("Logic Design\n  is the function of the designer to develop a Boolean expression which describes the required circuit performance."))
            {
                openLink(logic_course)
            }
            else if(news.heading.equals( "Linear algebra\n is flat differential geometry and serves in tangent spaces to manifolds. "))
            {
                openLink(linear_course)
            }
            else if(news.heading.equals( "Statics\n is the study of methods for quantifying the forces between bodies"))
            {
                openLink(statics_course)
            }
            else if(news.heading.equals("Computer architecture \nis the organisation of the components which make up a computer system")){
                openLink(com_cor)
            }
            else if(news.heading.equals( "computer network \n is a set of computers sharing resources located on or provided by network nodes.")){
                openLink(com_cor)
            }
            else if(news.heading.equals("Algorithm\n is a set of well-defined instructions to solve a particular problem.")){
                openLink(algo_cor)
            }
            else if(news.heading.equals("Systems analysis\n is the process by which an individual (s) studies a system such that an information system can be analyzed")){
                openLink(sys_cor)
            }
            else if(news.heading.equals( " presentation & Communication skills \n are Building Student Confidence in Oral Communication")){
                openLink(pre_cor)
            }
            else if(news.heading.equals(  "Differential equation\n is an equation with one or more derivatives of a function. ")){
                openLink(diff_cor)
            }
        }

        binding.btnBook.setOnClickListener{
            if(news.heading.equals("C++\n is a popular programming language.\n")){
                openLink(cpp_book)
            }
            else if(news.heading.equals("Discrete mathematics\n Discrete mathematics is the branch of mathematics ")){
                openLink(DM_book)
            }
            else if(news.heading.equals("Human rights \n are rights inherent to all human beings \n")){
                openLink(HR_book)
            }
            else if(news.heading.equals("physics \n is the natural science that studies matter, its ")){
                openLink(PH_book)
            }
            else if(news.heading.equals("English \n the most popular language used in all over the world ")){
                //openLink(PH_course)
                val toast = Toast.makeText(applicationContext, "No Link", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(news.heading.equals("math \n is used to make equation to solve problems")){
                //openLink(PH_course)
                val toast = Toast.makeText(applicationContext, "No Link", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(news.heading.equals("Computer science \n is the study of computers and computational systems.")){
                openLink(intro_book)
            }
            else if(news.heading.equals("Data structure\n is a storage that is used to store and organize data"))
            {
                openLink(data_book)
            }
            else if(news.heading.equals( "A management information system (MIS)\n is an information system used for decision-making"))
            {
                openLink(mis_book)
            }
            else if(news.heading.equals(  "Information system\n an integrated set of components for collecting, storing, and processing data "))
            {
                openLink(inf_book)
            }
            else if(news.heading.equals("Logic Design\n  is the function of the designer to develop a Boolean expression which describes the required circuit performance."))
            {
                openLink(logic_book)
            }
            else if(news.heading.equals( "Linear algebra\n is flat differential geometry and serves in tangent spaces to manifolds. "))
            {
                openLink(linear_book)
            }
            else if(news.heading.equals( "Statics\n is the study of methods for quantifying the forces between bodies"))
            {
                openLink(statics_book)
            }
            else if (news.heading.equals("Computer architecture \nis the organisation of the components which make up a computer system")) {
                openLink(com_bo)
            } else if (news.heading.equals(" computer network \\n is a set of computers sharing resources located on or provided by network nodes.")) {
                openLink(network_bo)
            }
            else if (news.heading.equals("Algorithm\n is a set of well-defined instructions to solve a particular problem.")) {
                openLink(algo_bo)
            }
            else if (news.heading.equals("Systems analysis\n is the process by which an individual (s) studies a system such that an information system can be analyzed")) {
                openLink(sys_bo)
            }
            else if (news.heading.equals( " presentation & Communication skills \n are Building Student Confidence in Oral Communication")) {
                openLink(pre_bo)
            }
            else if (news.heading.equals(  "Differential equation\n is an equation with one or more derivatives of a function. ")) {
                openLink(dif_bo)
            }

        }

    }

    fun openLink(link: String){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(browserIntent)
    }
}