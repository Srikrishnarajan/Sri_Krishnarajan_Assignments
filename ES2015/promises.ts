const p1 = new Promise((resolve: (arg0: number) => void, reject: any) => {
    console.log('The first promise has resolved');
    resolve(64);
});

const p2 = new Promise((resolve: (arg0: number) => void, reject: any) => {
    console.log('The second promise has resolved');
    resolve(76);
});

Promise.all([p1, p2]).then((results: any[]) => {
    const total = results.reduce((p: any, c: any) => p + c);

    console.log(`Results: ${results}`);
    console.log(`Sum: ${total}`);
});
