// var age:number=20;
// if (age>50){
//     age+=10;
// }
// console.log(age)

//built in types
//nuber String boolean null undefined object in javascript
//any,unkown ,never, enum ,tuple in typescript

// let sales=123_456_789;
// let course="typescript"
// let level;
// let is_published:boolean=true;

//if we initialized the value then it will automaticaally take the type 
//if not then it will type of any 

//any type will accept any type of data types then its a out of transcript allowance

// level=1
// level='a'


// function render(document:any){
//     console.log(document)
// }

//Arrays

// let numbers:number[]=[1,2,3]
// let numbers1=[1,4,5]
// let number=[]
// number[0]=23
// number[1]='1'
// numbers.forEach(n=>n.)


//tuple

// we need to assign the type also before initializing 
// let user:[number,string,boolean]=[1,"Manu",true]
// user.push(1);

//enums

//const samll=2
// const medium=3
// const large=4

// const enum Size{small=2,medium,large};

// let mySize:Size=Size.large

// console.log(mySize)


//functions
// function calculateTax(income:number,taxyear=2020):number{
//     if (income<15000 && taxyear<2022){
//         return income*1.5;
//     }
//     return income*1.2
// }

// calculateTax(20_000,2024)

//objects

// let employee:{
//     readonly id:number;
//     name?:String
//     retire:(date:Date)=>void 

// }={id:1,name:"Manu",retire:(date:Date)=>{
//     console.log(date)
// }}
// employee.name="manu";


// advanced concepts of objects

//type aliases

// type Employee={
//     readonly id:number
//     name:String
//     retire:(date:Date)=>void
// }


//Union 
// function KgToLbs(weight:number|string):number{
//     if (typeof weight==="number")
//     {
//         return weight*2.2
//     }
//     else{
//         return parseInt(weight)*2.2
//     }

// }
// KgToLbs(10)
// KgToLbs("10")


// intersection 

// let weight :number &string;

// type Draggable={
//     drag:()=>void
// }

// type Resizable ={
//     resize:()=>void
// }

// type UIWidget=Draggable & Resizable;

// let textBox:UIWidget={
//     drag:()=>{},
//     resize:()=>{}
// }

// Literal types

// To limit values to particular values


// type Quantity =50|100;
// let quantity:Quantity=100;

// type Metric='cm'|'inch';


//nullable types
// function greet(name:String|null|undefined){
//     if (name)
//     return name.toUpperCase();
// else{
//     console.log("Hola");
// }
// }

// greet(null)



//optional chaining 
// console.log(cutsomer?.birthday)
// if the customer not null or not undefined then it will 


